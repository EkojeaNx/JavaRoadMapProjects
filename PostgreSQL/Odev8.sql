/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 8 */
-- 1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee(
	id int,
	name varchar(50),
	birthday Date,
	email varchar(100)
);
-- 2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Verile', '2022-10-11', 'vnaul0@home.pl');
insert into employee (id, name, birthday, email) values (2, 'Brnaby', '2023-04-20', 'btirrey1@tamu.edu');
insert into employee (id, name, birthday, email) values (3, 'Perl', '2022-12-13', 'pjecks2@shinystat.com');
insert into employee (id, name, birthday, email) values (4, 'Matthiew', '2022-09-16', 'mrobertet3@people.com.cn');
insert into employee (id, name, birthday, email) values (5, 'Kathy', '2023-06-01', 'khatrey4@dell.com');
insert into employee (id, name, birthday, email) values (6, 'Brewer', '2023-06-18', 'bphilipard5@epa.gov');
insert into employee (id, name, birthday, email) values (7, 'Lyell', '2023-07-12', 'llongdon6@gnu.org');
insert into employee (id, name, birthday, email) values (8, 'Afton', '2022-08-03', 'abielfeldt7@google.com.hk');
insert into employee (id, name, birthday, email) values (9, 'Minette', '2023-02-03', 'mhaymes8@1688.com');
insert into employee (id, name, birthday, email) values (10, 'Mirabel', '2022-12-24', 'mmuckle9@ted.com');
insert into employee (id, name, birthday, email) values (11, 'Elsie', '2022-12-16', 'eprentya@woothemes.com');
insert into employee (id, name, birthday, email) values (12, 'Shani', '2023-05-21', 'saudusb@comcast.net');
insert into employee (id, name, birthday, email) values (13, 'Zahara', '2023-02-03', 'zskylettc@princeton.edu');
insert into employee (id, name, birthday, email) values (14, 'Irwinn', '2023-05-01', 'igrealishd@surveymonkey.com');
insert into employee (id, name, birthday, email) values (15, 'Ignace', '2023-01-31', 'iscurre@mashable.com');
insert into employee (id, name, birthday, email) values (16, 'Luci', '2023-02-12', 'lrunnettf@google.pl');
insert into employee (id, name, birthday, email) values (17, 'Ermanno', '2023-01-12', 'emacranaldg@mit.edu');
insert into employee (id, name, birthday, email) values (18, 'Georgie', '2022-08-01', 'gelderidgeh@google.it');
insert into employee (id, name, birthday, email) values (19, 'Ernst', '2023-03-08', 'eheakei@google.com');
insert into employee (id, name, birthday, email) values (20, 'Esra', '2023-02-25', 'ehaselhurstj@techcrunch.com');
insert into employee (id, name, birthday, email) values (21, 'Marilyn', '2023-03-11', 'mlangloisk@amazon.co.uk');
insert into employee (id, name, birthday, email) values (22, 'Sephira', '2022-10-09', 'slegendrel@unblog.fr');
insert into employee (id, name, birthday, email) values (23, 'Tarah', '2022-09-15', 'tbalaamm@omniture.com');
insert into employee (id, name, birthday, email) values (24, 'Kimbell', '2023-05-20', 'kbowien@ask.com');
insert into employee (id, name, birthday, email) values (25, 'Arabella', '2023-02-10', 'acaseyo@chicagotribune.com');
insert into employee (id, name, birthday, email) values (26, 'Archaimbaud', '2022-09-15', 'agernerp@oakley.com');
insert into employee (id, name, birthday, email) values (27, 'Asia', '2023-05-26', 'acancellarioq@usa.gov');
insert into employee (id, name, birthday, email) values (28, 'Roselia', '2022-08-18', 'rmccrier@theatlantic.com');
insert into employee (id, name, birthday, email) values (29, 'Corey', '2023-06-26', 'cwyeths@toplist.cz');
insert into employee (id, name, birthday, email) values (30, 'Annmarie', '2022-11-01', 'alowdianet@amazon.com');
insert into employee (id, name, birthday, email) values (31, 'Emanuel', '2023-01-15', 'etigwellu@ask.com');
insert into employee (id, name, birthday, email) values (32, 'Jaime', '2022-10-26', 'jreynaultv@blogs.com');
insert into employee (id, name, birthday, email) values (33, 'Gustie', '2023-01-31', 'gorganw@a8.net');
insert into employee (id, name, birthday, email) values (34, 'Duke', '2023-07-17', 'dbritnellx@meetup.com');
insert into employee (id, name, birthday, email) values (35, 'Hurleigh', '2023-05-11', 'hcocklingy@wufoo.com');
insert into employee (id, name, birthday, email) values (36, 'Carlyn', '2022-12-04', 'cpuncherz@paginegialle.it');
insert into employee (id, name, birthday, email) values (37, 'Emogene', '2022-11-03', 'ecamm10@ebay.com');
insert into employee (id, name, birthday, email) values (38, 'Burch', '2023-02-10', 'bhabbergham11@e-recht24.de');
insert into employee (id, name, birthday, email) values (39, 'Chase', '2022-12-28', 'cdurno12@house.gov');
insert into employee (id, name, birthday, email) values (40, 'Hedvig', '2022-11-12', 'htuhy13@usda.gov');
insert into employee (id, name, birthday, email) values (41, 'Kevon', '2023-06-23', 'kkaubisch14@jalbum.net');
insert into employee (id, name, birthday, email) values (42, 'Delores', '2023-07-07', 'dlenchenko15@yellowpages.com');
insert into employee (id, name, birthday, email) values (43, 'Stormi', '2022-10-04', 'sbroadstock16@gizmodo.com');
insert into employee (id, name, birthday, email) values (44, 'Dominga', '2023-07-03', 'dfreeland17@cam.ac.uk');
insert into employee (id, name, birthday, email) values (45, 'Yul', '2022-12-28', 'yabrahami18@twitpic.com');
insert into employee (id, name, birthday, email) values (46, 'Nicko', '2023-06-12', 'ncoveley19@hhs.gov');
insert into employee (id, name, birthday, email) values (47, 'Beverlie', '2023-02-13', 'bantushev1a@imageshack.us');
insert into employee (id, name, birthday, email) values (48, 'Todd', '2022-11-04', 'tdrabble1b@psu.edu');
insert into employee (id, name, birthday, email) values (49, 'Courtney', '2023-04-12', 'cmaydwell1c@fc2.com');
insert into employee (id, name, birthday, email) values (50, 'Karel', '2022-12-27', 'kleighton1d@wix.com');
-- 3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee SET id = 51 WHERE name = 'Karel' RETURNING *;
UPDATE employee SET name = 'Türkeş Ekrem ŞENTÜRK' WHERE id = 1 RETURNING *;
UPDATE employee SET birthday = '1990-03-07' WHERE email = 'btirrey1@tamu.edu' RETURNING *;
UPDATE employee SET email = 'themail@dd.com' WHERE name = 'Duke' RETURNING *;
UPDATE employee SET name = 'Y', birthday = '2020-02-02', email = 'Y@Y.com' WHERE id BETWEEN 45 AND 47 RETURNING *;
-- 4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee WHERE id = 5 RETURNING *;
DELETE FROM employee WHERE name = 'Matthiew' RETURNING *;
DELETE FROM employee WHERE birthday = '2022-08-03' RETURNING *;
DELETE FROM employee WHERE email = 'mhaymes8@1688.com' RETURNING *;
DELETE FROM employee WHERE id BETWEEN 15 AND 17 RETURNING *;