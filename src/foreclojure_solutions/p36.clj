(ns foreclojure-solutions.p36
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Let it Be"
  10 => (let __ (+ x y))
  4 => (let __ (+ y z))
  1 => (let __ z))
