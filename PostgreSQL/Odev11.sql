/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 11 */
-- 1. actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
(SELECT a.first_name FROM actor a)
UNION ALL
(SELECT c.first_name FROM customer c);
-- 2. actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
(SELECT a.first_name FROM actor a)
INTERSECT
(SELECT c.first_name FROM customer c);
-- 3. actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
(SELECT a.first_name FROM actor a)
EXCEPT
(SELECT c.first_name FROM customer c);
-- 4. İlk 3 sorguyu tekrar eden veriler için de yapalım.
(
	(SELECT a.first_name FROM actor a)
	UNION ALL
	(SELECT c.first_name FROM customer c)
)
UNION
(
	(SELECT a.first_name FROM actor a)
	INTERSECT
	(SELECT c.first_name FROM customer c)
)
UNION
(
	(SELECT a.first_name FROM actor a)
	EXCEPT
	(SELECT c.first_name FROM customer c)
);