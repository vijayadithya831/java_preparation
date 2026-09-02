CREATE TABLE TEST_EMPLOYEE_DETAILS (
                                       EMPLOYEE_ID NUMBER PRIMARY KEY,
                                       EMPLOYEE_NAME VARCHAR2(100) NOT NULL,
                                       AGE NUMBER(3),
                                       SALARY NUMBER(10,2),
                                       DATE_OF_BIRTH DATE,
                                       DEPARTMENT VARCHAR2(50),
                                       CITY VARCHAR2(50),
                                       GENDER VARCHAR2(10),
                                       EXPERIENCE_YEARS NUMBER(2),
                                       IS_ACTIVE CHAR(1)
);

INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (101, 'Arun Kumar', 25, 42000, DATE '2001-03-15', 'IT', 'Chennai', 'Male', 2, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (102, 'Priya Sharma', 30, 68000, DATE '1996-07-22', 'HR', 'Bangalore', 'Female', 7, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (103, 'Rahul Verma', 28, 55000, DATE '1998-01-10', 'Finance', 'Mumbai', 'Male', 5, 'N');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (104, 'Sneha Iyer', 35, 90000, DATE '1991-09-18', 'IT', 'Hyderabad', 'Female', 11, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (105, 'Vikram Singh', 40, 120000, DATE '1986-11-05', 'Management', 'Delhi', 'Male', 16, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (106, 'Meera Nair', 27, 50000, DATE '1999-05-30', 'Support', 'Kochi', 'Female', 4, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (107, 'Karthik Raj', 24, 39000, DATE '2002-12-12', 'IT', 'Chennai', 'Male', 1, 'N');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (108, 'Anjali Gupta', 31, 72000, DATE '1995-04-08', 'Finance', 'Pune', 'Female', 8, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (109, 'Rohit Mehta', 29, 61000, DATE '1997-06-25', 'Sales', 'Ahmedabad', 'Male', 6, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (110, 'Divya Menon', 26, 47000, DATE '2000-08-14', 'HR', 'Chennai', 'Female', 3, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (111, 'Ajay Patel', 38, 98000, DATE '1988-02-03', 'Management', 'Surat', 'Male', 14, 'N');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (112, 'Neha Reddy', 33, 81000, DATE '1993-10-21', 'IT', 'Hyderabad', 'Female', 9, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (113, 'Suresh Babu', 45, 135000, DATE '1981-01-17', 'Finance', 'Chennai', 'Male', 20, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (114, 'Pooja Kapoor', 23, 35000, DATE '2003-04-11', 'Support', 'Delhi', 'Female', 1, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (115, 'Harish Rao', 36, 88000, DATE '1990-12-01', 'Sales', 'Bangalore', 'Male', 12, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (116, 'Aisha Khan', 32, 76000, DATE '1994-09-09', 'HR', 'Mumbai', 'Female', 9, 'N');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (117, 'Naveen Das', 27, 53000, DATE '1999-02-28', 'IT', 'Kolkata', 'Male', 4, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (118, 'Lakshmi Devi', 41, 110000, DATE '1985-07-07', 'Management', 'Chennai', 'Female', 17, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (119, 'Manoj Joshi', 34, 79000, DATE '1992-06-19', 'Finance', 'Pune', 'Male', 10, 'Y');
INSERT INTO TEST_EMPLOYEE_DETAILS VALUES (120, 'Keerthi Anand', 29, 60000, DATE '1997-11-27', 'Support', 'Hyderabad', 'Female', 6, 'Y');
COMMIT;

CREATE TABLE USER_OBJECT (
                             USER_ID NUMBER CONSTRAINT PK_USER_OBJECT PRIMARY KEY,
                             USERNAME VARCHAR2(50) NOT NULL,
                             PASSWORD VARCHAR2(100) NOT NULL,
                             EMAIL VARCHAR2(100) UNIQUE NOT NULL
);

INSERT INTO USER_OBJECT VALUES (101, 'Ethan Carter',      'ShadowWolf@99',     'ethan.carter@midnightmail.com');
INSERT INTO USER_OBJECT VALUES (102, 'Olivia Bennett',    'VelvetFlame#21',    'olivia.bennett@crimsonheart.com');
INSERT INTO USER_OBJECT VALUES (103, 'Luca Romano',       'InfernoSoul@88',    'luca.romano@italiavibes.com');
INSERT INTO USER_OBJECT VALUES (104, 'Sofia Martinez',    'MoonlightKiss!7',   'sofia.martinez@lunarpassion.com');
INSERT INTO USER_OBJECT VALUES (105, 'Noah Anderson',     'WildThunder@45',    'noah.anderson@stormpulse.com');
INSERT INTO USER_OBJECT VALUES (106, 'Isabella Rossi',    'ScarletDesire#9',   'isabella.rossi@rosefire.com');
INSERT INTO USER_OBJECT VALUES (107, 'Liam OConnor',      'PhoenixRise@77',    'liam.oconnor@embervault.com');
INSERT INTO USER_OBJECT VALUES (108, 'Amelia Johnson',    'HeartBreaker@13',   'amelia.johnson@velvetdreams.com');
INSERT INTO USER_OBJECT VALUES (109, 'Mateo Alvarez',     'DarkTemptation@5',  'mateo.alvarez@obsidianlove.com');
INSERT INTO USER_OBJECT VALUES (110, 'Charlotte Morgan',  'ForeverYours#11',   'charlotte.morgan@eternalflame.com');
COMMIT;