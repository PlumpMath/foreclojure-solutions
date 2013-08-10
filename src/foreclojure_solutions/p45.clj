(ns foreclojure-solutions.p45
  (:use midje.sweet))

(defn  []
  "Implement me!")

(future-fact "Intro to Iterate"
  '(1 4 7 10 13) => (take 5 (iterate #(+ 3 %) 1)))


;(take 5 (iterate #(+ 3 %) 1))