package be.gestatech.cargo.tracker.backend.domain.model.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TrackingId implements Serializable {

    private static final long serialVersionUID = 6949627824979276407L;

    @Column(name = "TRACKING_ID", unique = true, updatable = false)
    private String id;

    public TrackingId() {
        // Nothing to initialize.
    }

    public TrackingId(String id) {
        Objects.requireNonNull(id, "[id] should not be null");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        boolean response = (other instanceof be.gestatech.cargo.tracker.backend.domain.vo.TrackingId);
        if (response) {
            be.gestatech.cargo.tracker.backend.domain.vo.TrackingId trackingId = (be.gestatech.cargo.tracker.backend.domain.vo.TrackingId) other;
            response = sameValueAs(trackingId);
        }
        return response;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrackingId{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    boolean sameValueAs(be.gestatech.cargo.tracker.backend.domain.vo.TrackingId trackingId) {
        return Objects.equals(getId(), trackingId.getId());
    }
}