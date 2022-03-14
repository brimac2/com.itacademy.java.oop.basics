public class ContractType {
    public enum ContractTypeName {
        FULLTIME {
            public String toString() {
                return "Full-Time";
            }
        },

        PARTTIME {
            public String toString() {
                return "Part-Time";
            }
        }
    }
}
