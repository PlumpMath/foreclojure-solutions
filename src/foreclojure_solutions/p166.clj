(ns foreclojure-solutions.p166
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Comparisons"
  :gt => (__ < 5 1)
  :eq => (__ (fn [x y] (< (count x) (count y))) "pear" "plum")
  :lt => (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3)
  (= :gt (__ > 0 2))
   => true)
