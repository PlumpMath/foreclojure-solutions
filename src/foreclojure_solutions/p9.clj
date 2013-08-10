(ns foreclojure-solutions.p9
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Sets: conj"
  #{1 2 3 4} (conj #{1 4 3} => __))
