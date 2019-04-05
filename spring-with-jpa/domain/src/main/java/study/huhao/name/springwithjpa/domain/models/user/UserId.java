package study.huhao.name.springwithjpa.domain.models.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import study.huhao.name.springwithjpa.domain.models.base.EntityId;

import java.util.UUID;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Value
@Getter(AccessLevel.NONE)
public class UserId implements EntityId {
    private UUID id;

    protected UserId() {
        id = UUID.randomUUID();
    }

    public static UserId of(String id) {
        return new UserId(UUID.fromString(id));
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
