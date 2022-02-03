.class Lcom/digdroid/alman/dig/t0$j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0$j;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[J

.field final synthetic c:Landroid/database/sqlite/SQLiteDatabase;

.field final synthetic d:Lcom/digdroid/alman/dig/t0$j;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0$j;[JLandroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$j$a;->d:Lcom/digdroid/alman/dig/t0$j;

    iput-object p2, p0, Lcom/digdroid/alman/dig/t0$j$a;->b:[J

    iput-object p3, p0, Lcom/digdroid/alman/dig/t0$j$a;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$j$a;->d:Lcom/digdroid/alman/dig/t0$j;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0$j;->a:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$j$a;->b:[J

    aget-wide v1, v0, p2

    new-instance p2, Lcom/digdroid/alman/dig/t0$j$a$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/t0$j$a$a;-><init>(Lcom/digdroid/alman/dig/t0$j$a;)V

    invoke-static {p1, v1, v2, p2}, Lcom/digdroid/alman/dig/m0;->b(Landroid/app/Activity;JLcom/digdroid/alman/dig/m0$o;)V

    return-void
.end method
