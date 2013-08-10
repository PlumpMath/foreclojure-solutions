(ns foreclojure-solutions.p13
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Sequences: rest"
  __ => (rest [10 20 30 40]))
