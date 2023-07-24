/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 9 */
-- 1. city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT c.city, ct.country FROM city c
INNER JOIN country ct ON c.country_id = ct.country_id
ORDER BY ct.country;
-- 2. customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT p.payment_id, c.first_name, c.last_name FROM customer c
INNER JOIN payment p ON c.customer_id = p.customer_id
ORDER BY c.first_name, c.last_name;
-- 3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT r.rental_id, c.first_name, c.last_name FROM customer c
INNER JOIN rental r ON r.customer_id = c.customer_id
ORDER BY c.first_name, c.last_name;