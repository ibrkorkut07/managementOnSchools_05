SELECT * FROM "public".student WHERE username = 'cramer07';

Find advisor teacher id ((1582) via student username (cramer07)
SELECT advisor_teacher_id FROM "public".student WHERE username = 'cramer07';

Find advisor teacher id ((1582) via student username (cramer07)
SELECT advisor_teacher_id FROM "public".student WHERE username = 'cramer07';

*** Find student id / student number (1165) via student username (cramer07)
SELECT id FROM "public".student WHERE username = 'cramer07';

*** Find meet_id via student_id / student number (1165)
SELECT meet_id FROM "public".meet_student_table WHERE student_id = (SELECT id FROM "public".student WHERE username = 'cramer07');

Find meet info by username
select * from "public".meet where id = (SELECT meet_id FROM "public".meet_student_table WHERE student_id = (SELECT id FROM "public".student WHERE username = 'cramer07'));

select * from "public".student_info where id = '780';
select lesson_lesson_id from "public".student_info where id = '780';

Find Lesson name via lesson_id
select lesson_name from "public".lesson where lesson.lesson_id = '1222';

*** Find all student info list (Lesson Name, Absentee, Midterm Exam, Final Exam, Note, Info Note, Average) via student number /id (1165))
SELECT * FROM "public".student_info WHERE student_info.student_id = '1165';
SELECT * FROM "public".student_info WHERE student_info.student_id = (SELECT id FROM "public".student WHERE username = 'cramer07');

Find advisor_teacher_id name via student username (cramer07)
SELECT advisor_teacher_id FROM "public".student WHERE username = 'cramer07';

Find all meeting info via advisor advisor_teacher_id
SELECT * FROM "public".meet WHERE advisor_teacher_id = '1582';

Find all meeting info via advisor teacher id
SELECT * FROM "public".meet WHERE advisor_teacher_id = '1582';

Find all student info list via student axam average
SELECT * FROM "public".student_info WHERE student_info.exam_average= '94.6';

SELECT lesson_program_id FROM "public".student_lessonprogram WHERE student_lessonprogram.student_id = '1165';

SELECT * FROM "public".student_lessonprogram WHERE student_lessonprogram.student_id = '1165';

# Get lesson_program_id via student_id
SELECT lesson_program_id FROM "public".student_lessonprogram WHERE student_lessonprogram.student_id = '1165';

# Get registered program list via student_id
SELECT * FROM "public".student_lessonprogram WHERE student_lessonprogram.student_id = '1165';

Find registered lesson program id by student id (1222, 5, 4, 7, 15, 14, 1709)
SELECT lesson_name FROM "public".lesson WHERE lesson_id = '7';

# Find (registered/chosen) lesson_lesson_id via lesson_program_id
SELECT lesson_lesson_id FROM "public".lesson_program_lesson where lesson_program_id = (SELECT lesson_program_id FROM "public".student_lessonprogram where student_lessonprogram.student_id = (SELECT id FROM "public".student WHERE username = 'cramer07'));

# Get registered lesson program via lesson_program.id
SELECT * FROM "public".lesson_program where lesson_program.id = '7';
SELECT lesson_name FROM "public".lesson where lesson_id = '1222;