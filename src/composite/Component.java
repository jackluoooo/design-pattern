package composite;

/**
 * @author：罗金星 date 2019/1/25 11:35
 **/

/**
 * 抽象组件
 */
public interface Component {
    void operation();
}

/**
 * 叶子组件
 */
interface Leaf extends Component{

}

/**
 * 容器组件
 */
interface Composite extends Component{
  void add(Component c);
  void remove(Component c);
  Component getchild(int index);
}

