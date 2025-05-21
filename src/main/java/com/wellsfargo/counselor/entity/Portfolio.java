@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    protected Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    // Getters and Setters
}
