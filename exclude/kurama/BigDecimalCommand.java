package dev.kurama;

import java.math.BigDecimal;

/**
 * Abstract {@link Command} that expects a single argument that can be converted to {@link BigDecimal}.
 */
abstract class BigDecimalCommand extends SingleArgCommand {

    protected final Outputter outputter;

    protected BigDecimalCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    protected final Result handleArg(String arg) {
        BigDecimal amount = tryParse(arg);
        if (amount == null) {
            outputter.output(arg + " is not a valid number");
        } else if (amount.signum() <= 0) {
            outputter.output("amount must be positive");
        } else {
            handleAmount(amount);
        }
        return Result.handled();
    }

    private static BigDecimal tryParse(String arg) {
        try {
            return new BigDecimal(arg);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Handles the given (positive) {@code amount} of money.
     */
    protected abstract void handleAmount(BigDecimal amount);
}
