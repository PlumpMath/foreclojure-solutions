;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.


(def c [1 2 3 4 5 6 7 8 9 10 11 12])

(defn splitter [n coll]
  (map #(take n %) coll))

(splitter c 2)

(doc defn)
(doc take)
(doc map)
(doc reduce)
(doc nth)
(doc ns-publics)
(doc for)
(doc partial)
(source partition)

;; Repeatedly take "n" items from the collection c

;(for [ #(take 3 %) [c]] )

(partition 2 c)

(defn window [n coll]
  "Take a collection and splits it into n groups"
  (partition (/ (count coll) n ) coll)
  )

(window 3 c)

; (1 2 3 4) (5 6 7 8) (9 10 11 12)

(map #(first %) (window 3 c))

(map #(first %) '(1 2 3 4) '(5 6 7 8) '(9 10 11 12))