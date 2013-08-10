(ns foreclojure-solutions.p49
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Split a sequence"
  (__ 3 [1 2 3 4 5 6]) => [[1 2 3] [4 5 6]]
  (__ 1 [:a :b :c :d]) => [[:a] [:b :c :d]]
  (__ 2 [[1 2] [3 4] [5 6]]) => [[[1 2] [3 4]] [[5 6]]])

; it's not partition 
;(partition 3 [1 2 3 4 5 6]) => ((1 2 3) (4 5 6)) 
;(partition 1 [:a :b :c :d]) => ((:a) (:b) (:c) (:d))
;(partition 3 [1 2 3 4 5 6])

(split-at 3 [1 2 3 4 5 6])
(split-at 1 [:a :b :c :d])
(split-at 2 [[1 2] [3 4] [5 6]])

;; nthnext looks like it could be useful:

(doc nthnext)

