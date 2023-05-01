--DROP TABLES
DROP TABLE  IF EXISTS twt_objects.Bodypart;
DROP TABLE IF EXISTS twt_objects.Exercise;

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";


--CREATE TABLES
CREATE TABLE twt_objects.Bodypart (
                                      ID UUID NOT NULL DEFAULT uuid_generate_v4(),
                                      Name varchar(50) NOT NULL,
                                      ForMeasurement boolean NOT NULL DEFAULT false,
                                      CreateDate timestamp NULL,
                                      CreatedBy varchar(50) NULL);

CREATE TABLE twt_objects.Exercise (
                                      ID UUID NOT NULL DEFAULT uuid_generate_v4(),
                                      Name varchar(50) NOT NULL,
                                      BodyPartID UUID NOT NULL,
                                      CreateDate timestamp NULL,
                                      CreatedBy varchar(50) NULL);


ALTER TABLE twt_objects.Bodypart ADD CONSTRAINT PK_Bodypart PRIMARY KEY (ID);
ALTER TABLE twt_objects.Exercise ADD CONSTRAINT PK_Exercise PRIMARY KEY (ID);


--INSERT DATA
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby)
VALUES ('Chest', Now(), 'JT');

INSERT INTO twt_objects.bodypart(
    name, createdate, createdby)
VALUES ('Shoulders', Now(), 'JT');
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby)
VALUES ('Triceps', Now(), 'JT');
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby)
VALUES ('Back', Now(), 'JT');
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby)
VALUES ('Biceps', Now(), 'JT');
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby)
VALUES ('Legs', Now(), 'JT');
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby)
VALUES ('Abs', Now(), 'JT');
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby)
VALUES ('Wrist', Now(), 'JT');
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Waist', Now(), 'JT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Chest', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Bust', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Hips', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Neck', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Left Thigh', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Right Thigh', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Left Calf', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Right Calf', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Left Bicep', Now(), 'GT', true);
INSERT INTO twt_objects.bodypart(
    name, createdate, createdby, formeasurement)
VALUES ('Right Bicep', Now(), 'GT', true);

SELECT * FROM twt_objects.bodypart;

INSERT INTO twt_objects.exercise(
    name, bodypartid, createdate, createdby)
SELECT 'Bench Press', ID, Now(), 'JT' FROM twt_objects.bodypart bp WHERE bp.name = 'Chest' AND bp.formeasurement = false;
INSERT INTO twt_objects.exercise(
    name, bodypartid, createdate, createdby)
SELECT 'Incline Bench Press', ID, Now(), 'JT' FROM twt_objects.bodypart bp WHERE bp.name = 'Chest' AND bp.formeasurement = false;
INSERT INTO twt_objects.exercise(
    name, bodypartid, createdate, createdby)
SELECT 'Flat Dumbell Fly', ID, Now(), 'JT' FROM twt_objects.bodypart bp WHERE bp.name = 'Chest' AND bp.formeasurement = false;
INSERT INTO twt_objects.exercise(
    name, bodypartid, createdate, createdby)
SELECT 'Incline Dumbell Fly', ID, Now(), 'JT' FROM twt_objects.bodypart bp WHERE bp.name = 'Chest' AND bp.formeasurement = false;
INSERT INTO twt_objects.exercise(
    name, bodypartid, createdate, createdby)
SELECT 'Lateral Dumbell Raise', ID, Now(), 'JT' FROM twt_objects.bodypart bp WHERE bp.name = 'Shoulders' AND bp.formeasurement = false;
INSERT INTO twt_objects.exercise(
    name, bodypartid, createdate, createdby)
SELECT 'Shoulder Press', ID, Now(), 'JT' FROM twt_objects.bodypart bp WHERE bp.name = 'Shoulders' AND bp.formeasurement = false;