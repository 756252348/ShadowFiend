package cn.dota.platform.infrastructure.utility.persistent;

public interface PersistableEnum<T> {
    T getPersistedValue();
}