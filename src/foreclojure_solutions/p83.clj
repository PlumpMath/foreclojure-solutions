(ns foreclojure-solutions.p83
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "A Half-Truth"
  false => (__ false false)
  true => (__ true false)
  false => (__ true)
  true => (__ false true false)
  false => (__ true true true)
  true => (__ true true true false))
