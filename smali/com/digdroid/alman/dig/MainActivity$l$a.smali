.class Lcom/digdroid/alman/dig/MainActivity$l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity$l;->a([Ljava/lang/Void;)Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/MainActivity$l;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity$l;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l$a;->a:Lcom/digdroid/alman/dig/MainActivity$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$l$a;->a:Lcom/digdroid/alman/dig/MainActivity$l;

    iget-object v0, v0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v1, "merged_games"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->A(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$l$a;->a:Lcom/digdroid/alman/dig/MainActivity$l;

    iget-object v0, v0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "UPDATE systems SET show_merged=0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
