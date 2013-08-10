(ns foreclojure-solutions.p98
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Equivalence Classes"
  (__ #(* % %) #{-2 -1 0 1 2}) => #{#{0} #{1 -1} #{2 -2}}
  (__ #(rem % 3) #{0 1 2 3 4 5 }) => #{#{0 3} #{1 4} #{2 5}}
  (__ identity #{0 1 2 3 4}) => #{#{0} #{1} #{2} #{3} #{4}}
  (= (__ (constantly true) #{0 1 2 3 4})
     #{#{0 1 2 3 4}})
   => true)
