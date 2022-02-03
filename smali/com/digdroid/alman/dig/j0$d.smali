.class Lcom/digdroid/alman/dig/j0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->t3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$d;->b:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$d;->b:Lcom/digdroid/alman/dig/j0;

    iget v0, p1, Lcom/digdroid/alman/dig/j0;->r0:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/digdroid/alman/dig/b2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->e0:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$d;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/digdroid/alman/dig/b2;-><init>(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/digdroid/alman/dig/g0;

    invoke-direct {p1}, Lcom/digdroid/alman/dig/g0;-><init>()V

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/digdroid/alman/dig/o3;

    invoke-direct {p1}, Lcom/digdroid/alman/dig/o3;-><init>()V

    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$d;->b:Lcom/digdroid/alman/dig/j0;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/p;->b(J)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$d;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/p1$a;->z(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
