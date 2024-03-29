/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 5 */
-- 1. film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız.
SELECT f.* FROM film f WHERE f.title LIKE '%n' ORDER BY f.length DESC LIMIT 5;
-- 2. film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci(6,7,8,9,10) 5 filmi(6,7,8,9,10) sıralayınız.
SELECT f.* FROM film f WHERE f.title LIKE '%n' ORDER BY f.length ASC OFFSET 5 LIMIT 5;
-- 3. customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız.
SELECT c.* FROM customer c WHERE c.store_id = 1 ORDER BY c.last_name ASC LIMIT 4;