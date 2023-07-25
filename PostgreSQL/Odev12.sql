/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 12 */
-- 1. film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
SELECT COUNT(*) FROM film f
WHERE f.length > (SELECT AVG(fi.length) FROM film fi);
-- 2. film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
SELECT COUNT(*) FROM film f
WHERE f.rental_rate = ANY (SELECT MAX(fi.rental_rate) FROM film fi);
-- 3. film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
SELECT * FROM film f
WHERE f.rental_rate = ANY (SELECT MIN(fi.rental_rate) FROM film fi)
AND	  f.replacement_cost = ANY (SELECT MIN(flm.replacement_cost) FROM film flm)
ORDER BY f.title ASC;
-- 4. payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
SELECT cus.customer_id, cus.first_name, cus.last_name FROM customer cus
WHERE cus.customer_id = ANY (SELECT p.customer_id FROM customer c
INNER JOIN payment p ON c.customer_id = p.customer_id
GROUP BY p.customer_id
ORDER BY COUNT(p.customer_id) DESC);