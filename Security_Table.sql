CREATE TABLE xx_ebs_user_security (
    user_id NUMBER PRIMARY KEY,
    user_name VARCHAR2(50),
    failed_attempts NUMBER,
    account_status VARCHAR2(20) 
);


INSERT INTO xx_ebs_user_security VALUES (1001, 'FIN_MANAGER', 4, 'ACTIVE');
INSERT INTO xx_ebs_user_security VALUES (1002, 'AR_CLERK', 0, 'ACTIVE');
COMMIT;