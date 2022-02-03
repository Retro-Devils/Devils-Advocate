.class Lcom/digdroid/alman/dig/f3$r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:[Z

.field final synthetic d:[J

.field final synthetic e:Lcom/digdroid/alman/dig/f3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3;I[Z[J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$r;->e:Lcom/digdroid/alman/dig/f3;

    iput p2, p0, Lcom/digdroid/alman/dig/f3$r;->b:I

    iput-object p3, p0, Lcom/digdroid/alman/dig/f3$r;->c:[Z

    iput-object p4, p0, Lcom/digdroid/alman/dig/f3$r;->d:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    iget v0, p0, Lcom/digdroid/alman/dig/f3$r;->b:I

    if-ge p2, v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$r;->c:[Z

    aget-boolean v0, v0, p2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$r;->e:Lcom/digdroid/alman/dig/f3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE roms SET ignored=0,merged_with=-1 WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/f3$r;->d:[J

    aget-wide v3, v2, p2

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$r;->e:Lcom/digdroid/alman/dig/f3;

    iget-object v0, p2, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$r;->e:Lcom/digdroid/alman/dig/f3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    const-string v0, "merge_games"

    invoke-static {p2, v0}, Lcom/digdroid/alman/dig/DatabaseService;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$r;->e:Lcom/digdroid/alman/dig/f3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p2}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$r;->e:Lcom/digdroid/alman/dig/f3;

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$r;->e:Lcom/digdroid/alman/dig/f3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/t0;->N2()V

    return-void
.end method
