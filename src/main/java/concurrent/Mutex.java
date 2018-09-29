package concurrent;

/**
 * @author evilhex
 *         2018/3/6.
 */
public interface Mutex {
    void lock();

    void release();
}
