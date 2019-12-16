package pact.etc;


/**
 * Designed for the detection configuration scenario(针对检测
 * 配置这个场景设计的).
 *
 * @author XyParaCrim
 */
public interface ConfigureCheckProcessing extends CheckProcessing {

    /**
     * Log successful detection configuration information in
     * a fixed format.
     *
     * @param description this's configuration info
     */
    default void reportConfigureFound(String description) {
        logger().info("check for {} ... found", description);
    }

    /**
     * Log failed detection configuration information in
     * a fixed format.
     *
     * @param description this's configuration info
     */
    default void reportConfigureNotFound(String description) {
        logger().error("check for {} ... not found", description);
    }

    /**
     * Log error detection configuration information in
     * a fixed format.
     *
     * @param description this's configuration info
     */
    default void reportConfigureError(String description) {
        logger().error("check for {} ... not found", description);
    }
}