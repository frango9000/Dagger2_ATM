package dev.kurama;

import java.util.List;
import java.util.Optional;

public interface Command {

    /**
     * String token that signifies this command should be selected (e.g.: "deposit", "withdraw")
     */
//    String key();

    /**
     * Process the rest of the command's words and do something.
     */
    Result handleInput(List<String> input);

    class Result {

        private final Status status;
        private final Optional<CommandRouter> nestedCommandRouter;

        public Result(Status status, Optional<CommandRouter> nestedCommandRouter) {
            this.status              = status;
            this.nestedCommandRouter = nestedCommandRouter;
        }

        public static Result invalid() {
            return new Result(Status.INVALID, Optional.empty());
        }

        public static Result handled() {
            return new Result(Status.HANDLED, Optional.empty());
        }

        static Result inputCompleted() {
            return new Result(Status.INPUT_COMPLETED, Optional.empty());
        }

        public Status getStatus() {
            return status;
        }

        public Optional<CommandRouter> getNestedCommandRouter() {
            return nestedCommandRouter;
        }

        static Result enterNestedCommandSet(CommandRouter nestedCommandRouter) {
            return new Result(Status.HANDLED, Optional.of(nestedCommandRouter));
        }
    }

    enum Status {
        INVALID,
        HANDLED,
        INPUT_COMPLETED
    }
}
