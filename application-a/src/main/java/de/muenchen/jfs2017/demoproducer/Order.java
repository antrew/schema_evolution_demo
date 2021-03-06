package de.muenchen.jfs2017.demoproducer;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

/**
 *
 * @author claus
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Singular("lineItem") private List<LineItem> lineItems;
}
