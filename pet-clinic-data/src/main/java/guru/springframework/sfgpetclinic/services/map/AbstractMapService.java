package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T> map = new HashMap<>();

	protected T findById(ID id) {
		return map.get(id);
	}

	protected T save(ID id, T entity) {
		return map.put(id, entity);
	}

	protected Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	protected void delete(T entity) {
		map.values().remove(entity);
	}

	protected void deleteById(ID id) {
		map.remove(id);
	}
}
