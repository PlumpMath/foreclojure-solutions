(ns foreclojure-solutions.p11
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Maps: conj"
  {:a 1, :b 2, :c 3} => (conj {:a 1} __ [:c 3]))
