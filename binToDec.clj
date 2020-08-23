
;; Bin To Dec
(def x "11001101")

(defn getKey [el]
  (*
    (Character/digit (get el (nth (keys el) 0)) 10)
    (Math/pow 2 (nth (keys el) 0))
  )
)

(def binKeyed (map-indexed hash-map  (reverse x)))

(println (int (reduce + (map getKey binKeyed))))