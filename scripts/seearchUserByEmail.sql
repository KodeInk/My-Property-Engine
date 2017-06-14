SELECT * FROM user  U 
JOIN person P 
ON P.userId = U.id
JOIN contacts  C 
ON P.id = C.parent_id AND C.parent_type LIKE 'PERSON'
WHERE C.type LIKE 'contact' AND U.status NOT LIKE 'DEACTIVATED'