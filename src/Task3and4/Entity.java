package Task3and4;

import java.io.Serializable;

public interface Entity extends Serializable { // extends Serializable - для того чтобы можно было использовать в сериализаци и обратного процесса
    boolean isForceUser();
}

