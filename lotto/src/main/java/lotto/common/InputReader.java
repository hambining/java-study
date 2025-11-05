package lotto.common;

@FunctionalInterface
public interface InputReader<T> {
    T read();
}
