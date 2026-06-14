package util;

import exceptions.ValidationException;

@FunctionalInterface
//T because we are not sure of the data type we gonna use in future
public interface Validation<T> {
    void validate(T value) throws ValidationException;
}
