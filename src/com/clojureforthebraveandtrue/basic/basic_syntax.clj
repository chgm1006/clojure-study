(ns com.clojureforthebraveandtrue.basic.basic-syntax)

; Map Exam
; Map은 {}로 표현한다
{}

{:first-name "charlie"
 :last-name "mcfishwish"}

{"string-key" +}

{name {:first "john" :middle "jacob" :last "jingleheimerschmidt"}}

; hash-map 함수로 map을 만들 수 있다
(hash-map :a 1 :b 2)

; map을 참조할때는 get 함수를 사용
(get {:a 0 :b 1} :b)

(get {:a 0 :b  {:c "no hum"}} :b)

; get 함수가 없는 key를 찾으면 nil을 반환
(get {:a 0 :b 1} :c)

; key가 없으면 message를 정해 줄 수 있다
(get {:a 0 :b 1} :c "unicon?")

; get-in 함수는 map안의 map을 참조 할 수 있다
(get-in {:a 0 :b {:c "ho num"}} [:b :c] )

(get-in {:a 0 :b {:c "ho num" :d {:e "no data"}}} [:b :d :e])

; get을 빼고 map에 key를 함수 인자처럼 사용할 수 있다
({:a 0 :b 1} :a)
