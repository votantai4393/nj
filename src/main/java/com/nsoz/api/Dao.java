
package com.nsoz.api;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Admin
 */
public interface Dao<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);
}
