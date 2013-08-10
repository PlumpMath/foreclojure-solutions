(ns foreclojure-solutions.p135
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Infix Calculator"
  7 => (__ 2 + 5)
  42 => (__ 38 + 48 - 2 / 2)
  8 => (__ 10 / 2 - 1 * 2)
  72 => (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))
