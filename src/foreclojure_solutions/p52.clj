(ns foreclojure-solutions.p52
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Destructuring"
  [2 4] (let [[a b c d e f g] (range)] => __))
