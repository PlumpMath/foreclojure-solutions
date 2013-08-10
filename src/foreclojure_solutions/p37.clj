(ns foreclojure-solutions.p37
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Regular Expressions"
  __ => (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
