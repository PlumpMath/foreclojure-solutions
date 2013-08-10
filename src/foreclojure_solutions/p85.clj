(ns foreclojure-solutions.p85
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Power Set"
  (__ #{1 :a}) => #{#{1 :a} #{:a} #{} #{1}}
  (__ #{}) => #{#{}}
  (__ #{1 2 3}) => #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}
  (count (__ (into #{} (range 10)))) => 1024)
