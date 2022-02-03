.class Lcom/digdroid/alman/dig/q2$m0$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2$m0$b;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/q2$m0$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2$m0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$m0$b$a;->a:Lcom/digdroid/alman/dig/q2$m0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "system"

    const-string v2, "ignore"

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aget-object p1, p1, v1

    const-string v1, "path"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "selected"

    invoke-virtual {v0, p1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string p1, "last_checked"

    invoke-virtual {v0, p1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$m0$b$a;->a:Lcom/digdroid/alman/dig/q2$m0$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$m0$b;->b:Lcom/digdroid/alman/dig/q2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "rompaths"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$m0$b$a;->a:Lcom/digdroid/alman/dig/q2$m0$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$m0$b;->b:Lcom/digdroid/alman/dig/q2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$m0;->b:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->requery()Z

    return-void
.end method
