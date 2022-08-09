INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (1,'Parhomenko','Olena',5,1,3,87);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (2,'Parhomenko','Oleh',2,5,1,92);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (3,'Kovalenko','Nadya',1,10,4,78);
  
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (4,'Homenko','Alex',3,3,1,95);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (5,'Vorona','Artem',5,2,3,87);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (6,'Yan','Oleh',4,7,4,67);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (7,'Ponomarenko','Alina',4,8,1,89);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (8,'Yanchenko','Kate',4,7,2,87);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (9,'Yarmak','Alla',1,9,1,77);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (10,'Solo','Olena',4,8,2,83);
    
INSERT INTO public."STUDENTS"(
	id, first_name, last_name, faculty_id, specialty_id, course, gpa)
	VALUES (11,'Parhomenko','Olena',2,6,1,99);
    
SELECT * FROM "STUDENTS";

SELECT "faculty_id" FROM "STUDENTS" WHERE "last_name" LIKE 'P%';

SELECT "first_name" FROM "STUDENTS" WHERE "gpa" > 85 AND "course" > 1;

SELECT "first_name" FROM "STUDENTS";

SELECT "name", "id" FROM "FACULTIES" LIMIT 3;

SELECT DISTINCT "name" FROM "SPECIALTY" ORDER BY NAME;

SELECT "first_name" , "id", GPA FROM "STUDENTS" WHERE "course" > 1 AND "faculty_id" > 2 AND NOT "gpa"< 80;
