(ns foreclojure-solutions.p48
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to some"
  6 => (some #{2 7 6} [5 6 7 8])
  6 => (some #(when (even? %) %) [5 6 7 8]))
