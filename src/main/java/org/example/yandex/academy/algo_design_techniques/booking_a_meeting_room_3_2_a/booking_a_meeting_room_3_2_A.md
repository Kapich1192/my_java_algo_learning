# Бронирование переговорки
Задано `n` интервалов. Требуется найти максимальное количество
взаимно непересекающихся интервалов.

Два интервала пересекаются, если они имеют хотя бы одну общую точку.

## Формат ввода
В первой строке задано одно число (1 ≤ n ≤ 100) — количество интервалов.

В следующих `n`строках заданы интервалы `l`, `r`,  (1 ≤ l ≤ r ≤ 50).

## Формат вывода
Выведите ответ на задачу.

### Пример 1
    Ввод
    3
    1 3
    2 3
    4 5
    Вывод
    2
### Пример 2
    Ввод    
    5
    1 2
    2 3
    4 5
    4 5
    5 6
    Вывод
    2
### Пример 3
    Ввод
    2
    1 50
    49 50
    Вывод
    1
### Ограничение памяти
    256.0 Мб
### Ограничение времени
    1 с

## Алгоритм решения (Жадный алгоритм)

* Отсортировать массив с интервалами по правой границе
* Сравнить пузырьком все значения друг с другом
  * Добавить не пересекающиеся интервалы в результирующий массив

Таким образом в результируюший массив гарантированно добавиться
максимально возможное количество интервалов 