import * as React from 'react';
import { WithStyles, withStyles } from '@material-ui/core/styles';
import {styles} from './styles';

const GRID_SIZE = 40;

// TODO move the message block to a separate component
const Board = (props: WithStyles<any>) => {


    var style = {
        top: this.props.row * GRID_SIZE,
        left: this.props.col * GRID_SIZE
    };

    var classes = "intersection";
    if (this.props.color != Board.EMPTY)
        classes += this.props.color == Board.BLACK ? " black" : " white";

    return (
        <div onClick={this.handleClick}
             className={classes} style={style}></div>
    );
};

export default withStyles(styles)(Board);
