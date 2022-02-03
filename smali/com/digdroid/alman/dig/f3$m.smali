.class Lcom/digdroid/alman/dig/f3$m;
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
.field final synthetic b:Lcom/digdroid/alman/dig/f3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$m;->b:Lcom/digdroid/alman/dig/f3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$m;->b:Lcom/digdroid/alman/dig/f3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE rompaths SET last_checked=0 WHERE system=\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$m;->b:Lcom/digdroid/alman/dig/f3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$m;->b:Lcom/digdroid/alman/dig/f3;

    iget-object p2, p1, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p2, p1, v1}, Lcom/digdroid/alman/dig/g3;->c(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$m;->b:Lcom/digdroid/alman/dig/f3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE roms SET merged_with=-1 WHERE system=\'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/f3$m;->b:Lcom/digdroid/alman/dig/f3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$m;->b:Lcom/digdroid/alman/dig/f3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    const-string p2, "merge_games"

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/DatabaseService;->t(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
