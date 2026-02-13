package org.example;

import java.util.List;

/**
 * Интерфейс для объектов, способных записывать данные в файл.
 */
public interface Writable {

    /**
     * Записывает список объектов в указанный файл.
     *
     * @param data     список объектов для записи
     * @param fileName имя CSV-файла
     */
    void writeToFile(List<?> data, String fileName);

}
