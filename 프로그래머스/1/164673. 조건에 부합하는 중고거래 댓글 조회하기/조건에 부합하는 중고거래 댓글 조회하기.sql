-- 코드를 입력하세요
SELECT title, b.board_id, reply_id, r.writer_id, r.contents, 
    DATE_FORMAT(r.created_date, '%Y-%m-%d') AS CREATED_DATE
FROM used_goods_board b JOIN used_goods_reply r ON b.board_id = r.board_id
WHERE DATE_FORMAT(b.created_date, '%Y-%m') = '2022-10'
ORDER BY r.created_date, title;