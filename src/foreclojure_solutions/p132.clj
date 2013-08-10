(ns foreclojure-solutions.p132
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Insert between two items"
  '(1 :less 6 :less 7 4 3) => (__ < :less [1 6 7 4 3])
  '(2) => (__ > :more [2])
  [0 1 :x 2 :x 3 :x 4] => (__ #(and (pos? %) (< % %2)) :x (range 5))
  (empty? (__ > :more ())) => true
  [0 1 :same 1 2 3 :same 5 8 13 :same 21]
     (take 12 (->> [0 1]
                   (iterate (fn [[a b]] [b (+ a b)]))
                   (map first)
                   (__ (fn [a b] => (= (mod a 2) (mod b 2)))
                       :same))))
